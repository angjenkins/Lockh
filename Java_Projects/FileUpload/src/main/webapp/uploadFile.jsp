 <html>
<head>
<title>File Uploading Form</title>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script>

$(document).ready(function(){
       alert('jsloaded')
       $('#submitbutton').click(function(){
               alert('submitted')
               $()
       })
})
</script>
</head>
<body>
<h3>File Upload:</h3>
       Select a file to upload: <br />
       <form id='uploadform' action="UploadServlet" method="post"
                               enctype="multipart/form-data">
       <input type="file" name="file" size="50" />
       <br />
       <input type="submit" value="Upload File" />
</form>
<!--  <input type="submit" value="Upload File" />-->