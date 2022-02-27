SUMMARY = "bwidget used by tcl/tk needed"
SECTION = "devel/tcltk"
LICENSE = "tcl"

LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=af21afb4e406f3d8e15b91dd3fa0a978"

SRC_URI = "git://github.com/TurBoss/bwidget.git;protocol=git;rev=master"

SRC_URI[sha256sum] = "edcf580512170aba9ba6c55854e3b9ec6a11a3b08dcfb89bac99901971687c40"

S = "${WORKDIR}/git"

DEPENDS = 'tcl'

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
    install -d ${libdir}/tcl8.6/${PN}-${PV}/
    cp -r ${S}/* ${libdir}/tcl8.6/${PN}-${PV}/
}

PACKAGES = "${PN}"

FILES_${PN} += "\
    ${libdir} \
    ${libdir}/tcl8.6/${PN}-${PV}/ \
"