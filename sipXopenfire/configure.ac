AC_PREREQ(2.57)
AC_INIT(sipXopenfire, 19.08, sipx-dev@list.sipfoundry.org)
AC_CONFIG_AUX_DIR(config)
m4_include([config/general.m4])
m4_include([config/sipXlib.m4])
m4_include([config/java2.m4])
AM_INIT_AUTOMAKE(foreign tar-ustar)
SFAC_INIT_FLAGS
CHECK_POSTGRES
CHECK_OPENFIRE
AC_PROG_JAVA_CC([javac])
AC_PROG_JAVA([java])
PROG_JAVA_DEP
AC_CONFIG_FILES([
  Makefile
  etc/Makefile
  bin/Makefile  
  presence-plugin/src/Makefile
  presence-plugin/Makefile
  sqa-plugin/Makefile
  vcard-synchserver/Makefile  
  config-plugin/Makefile
  ws-plugin/Makefile
  mongo-lib/Makefile
  mongo-sync-plugin/Makefile
  openfire-plugins/Makefile
])
AC_OUTPUT
