LocalURLToRecordFeedback = '/gui/record_feedback'
GoogleAnalyticsInclusionScript = """   <script>
  (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
  })(window,document,'script','//www.google-analytics.com/analytics.js','ga');

  ga('create', 'UA-48986383-1', 'acquisition.gov',{'cookieDomain':'none'});
  ga('send', 'pageview');

</script>"""

GITHHUB_APPLICATION__PUBLIC_KEY = 'R8uvWsUFvbGR6dKowJMHo4ozcnM'

# it would be better to use boolean, but these are interpreted
# directly in templates, and so it easier to use strings
GITHUB_DISPLAY_VALUE = 'F'
MYUSA_DISPLAY_VALUE = 'F'
MAX_DISPLAY_VALUE = 'T'
BASIC_DISPLAY_VALUE = 'F'
GITHUB_APPLICATION__PUBLIC_KEY = 'R8uvWsUFvbGR6dKowJMHo4ozcnM'


#OMBMAX_REDIRECT_URL = 'https://login.max.gov/cas/login?service=https://p3-dev.fas.gsa.gov/gui/ReturnLoginViaMax'
