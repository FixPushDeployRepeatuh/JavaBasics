setTimeout(() => {
                const svgElement = document.querySelector("#chart-container svg");
                if (!svgElement) {
                    alert("Chart not found!");
                    return;
                }

                const bbox = svgElement.getBBox();
                const width = bbox.width;
                const height = bbox.height;

                const clone = svgElement.cloneNode(true);
                clone.setAttribute("viewBox", `${bbox.x} ${bbox.y} ${width} ${height}`);
                clone.setAttribute("width", width);
                clone.setAttribute("height", height);
                clone.setAttribute("preserveAspectRatio", "xMinYMin meet");

                let cssStyles = "";
                for (const sheet of document.styleSheets) {
                    try {
                        const rules = sheet.cssRules || sheet.rules;
                        for (const rule of rules) {
                            cssStyles += rule.cssText;
                        }
                    } catch (e) {
                    }
                }

                const styleTag = document.createElementNS("http://www.w3.org/2000/svg", "style");
                styleTag.innerHTML = `<![CDATA[${cssStyles}]]>`;
                clone.insertBefore(styleTag, clone.firstChild);

                setTimeout(() => {
                    const svgData = new XMLSerializer().serializeToString(clone);
                    const svgBlob = new Blob([svgData], { type: "image/svg+xml;charset=utf-8" });
                    const svgUrl = URL.createObjectURL(svgBlob);

                    const downloadLink = document.createElement("a");
                    downloadLink.href = svgUrl;
                    downloadLink.download = `org-chart.svg`;
                    document.body.appendChild(downloadLink);
                    downloadLink.click();
                    document.body.removeChild(downloadLink);

                    setTimeout(() => URL.revokeObjectURL(svgUrl), 100);
                }, 0);
            }, 0);