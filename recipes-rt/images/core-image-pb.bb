require recipes-core/images/core-image-minimal.bb

# Skip processing of this recipe if linux-intel-rt is not explicitly specified as the
# PREFERRED_PROVIDER for virtual/kernel. This avoids errors when trying
# to build multiple virtual/kernel providers.
python () {
    if d.getVar("PREFERRED_PROVIDER_virtual/kernel") != "linux-intel-rt":
        raise bb.parse.SkipPackage("Set PREFERRED_PROVIDER_virtual/kernel to linux-intel-rt to enable it")
}

DESCRIPTION = "A small image just capable of allowing a device to boot plus a \
real-time test suite and tools appropriate for real-time use."

# X11 stuff
IMAGE_FEATURES += "splash package-management x11-base"
REQUIRED_DISTRO_FEATURES = "x11"

# RT stuff
DEPENDS += "linux-intel-rt"

IMAGE_INSTALL += " rt-tests hwlatdetect procps linuxcnc \
                   ca-certificates python3-setuptools \
                   python3-pyyaml tk tcl \
				   packagegroup-core-boot \
				   packagegroup-core-full-cmdline \
				   ${CORE_IMAGE_EXTRA_INSTALL} \
                   "

LICENSE = "MIT"

QB_MEM = '${@bb.utils.contains("DISTRO_FEATURES", "opengl", "-m 512", "-m 256", d)}'

inherit core-image features_check