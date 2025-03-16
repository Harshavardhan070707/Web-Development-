document.getElementById("feedbackForm").addEventListener("submit", function(event){
    event.preventDefault(); // Prevent the form from submitting normally
    
    // Display confirmation message
    document.getElementById("confirmation").style.display = "block";
});