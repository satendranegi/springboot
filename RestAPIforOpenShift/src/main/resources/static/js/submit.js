var forename = $("input[name=\"forename\"]").val();
var surname = $("input[name=\"surname\"]").val();

$.ajax({
    url: "http://myurl/postpage.ashx",
    type: "POST",
    async: true, // set to false if you don't mind the page pausing while waiting for response
    cache: false,
    dataType: "json",
    data: "{ 'forename': '" + forename + "', 'surname': '" + surname + "' }",
    contentType: "application/json; charset=utf-8",
    success: function(data) {
        // handle your successful response here
    },
    error: function(xhr, ajaxOptions, thrownError) {
        // handle your fail response here
    }
});