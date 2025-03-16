const texts = [
    "CODER.",
    "WEB DEVELOPER.",
    "GAME DEVELOPER.",
    "DESIGNER.",
  ];
  let index = 0;
  let textIndex = 0;
  
  function type() {
    const text = texts[textIndex];
    let typedText = text.slice(0, index);
  
    if (index < text.length) {
      typedText += "|"; 
  }
  
      document.getElementById("typing-animation").innerText = typedText;
  
      index++;
  
      if (index > text.length) {
        index = 0;
        textIndex++;
        if (textIndex >= texts.length) {
          textIndex = 0;
        }
      }
    }
  
    setInterval(type, 200);
  
  