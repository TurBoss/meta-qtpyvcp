DESCRIPTION = "LinuxCNC"
SECTION = "examples" 
LICENSE = "GPLv2" 
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263" 
SECTION="realtime/application"

SRC_URI = "git://github.com/linuxcnc/linuxcnc.git;protocol=git;rev=master\
           file://0001-fix-configure.patch\
           "


DEPENDS = "intltool readline eudev libmodbus libusb1 gtk+3 dpkg python3 libxinerama boost glib-2.0 pkgconfig procps tk tk-native tcl-native python3-native tcl python3"

S = "${WORKDIR}/git"

inherit autotools binconfig pkgconfig gettext python3native

export BUILD_SYS
export HOST_SYS
export STAGING_LIBDIR
export STAGING_INCDIR
export STAGING_LIBDIR_NATIVE
export STAGING_INCDIR_NATIVE
export STAGING_BINDIR_NATIVE
export ARCHCMD="/bin/echo ${TARGET_ARCH}"


RDEPENDS_${PN} = "boost-dev python3-dev python3 procps tcl"

bindir_progs = "free pkill pmap pgrep pwdx skill snice top uptime w"
base_bindir_progs += "kill pidof ps watch"
base_sbindir_progs += "sysctl"


EXTRA_OECONF = "--host --host-alias 'amd64'"
# EXTRA_OECONF += "--enable-non-distributable=yes"
EXTRA_OECONF += "--disable-gtk2"
EXTRA_OECONF += "--with-python=${STAGING_BINDIR_NATIVE}/python3-native/python3"
# EXTRA_OECONF += "--with-boost-python=${STAGING_BINDIR_NATIVE}/python3-native/python3"
#EXTRA_OECONF += "--with-boost=${STAGING_DIR_TARGET}/usr"
EXTRA_OECONF += "--with-tkConfig=${STAGING_DIR_TARGET}/usr/lib/tkConfig.sh"
EXTRA_OECONF += "--with-tclConfig=${STAGING_DIR_TARGET}/usr/lib/tclConfig.sh"

do_configure() {
  cd ${S}/src
  autoupdate
  ./autogen.sh    
  ./configure ${EXTRA_OECONF}
}

do_compile() {
  cd ${S}/src
  make
}

do_install() {
  cd ${S}/src
  make install
}
