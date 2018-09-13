import socket
machinename = socket.gethostname()
print 'MachineName = ', machinename
#dev-box
if machinename == 'fcoh1c-pp01d':
   from configs.dev.guiconfigs import GoogleAnalyticsInclusionScript,LocalURLToRecordFeedback,OMBMAX_REDIRECT_URL
#test-web-01
elif machinename == 'fcoh1c-ppweb01t':
   from configs.dev.guiconfigs import GoogleAnalyticsInclusionScript,LocalURLToRecordFeedback,OMBMAX_REDIRECT_URL
#test-web-02
elif machinename == 'fcoh1c-ppweb02t':
   from configs.dev.guiconfigs import GoogleAnalyticsInclusionScript,LocalURLToRecordFeedback,OMBMAX_REDIRECT_URL
#prod-web-01
elif machinename == 'fcoh1c-pppweb01':
   from configs.dev.guiconfigs import GoogleAnalyticsInclusionScript,LocalURLToRecordFeedback,OMBMAX_REDIRECT_URL
#prod-web-02
elif machinename == 'fcoh1c-pppweb02':
   from configs.dev.guiconfigs import GoogleAnalyticsInclusionScript,LocalURLToRecordFeedback,OMBMAX_REDIRECT_URL

