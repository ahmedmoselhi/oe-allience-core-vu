SUMMARY = "GigaBlue Enigma2 Skin Universe"
MAINTAINER = "openmips"
SECTION = "base"
PRIORITY = "required"
LICENSE = "proprietary"
inherit allarch

require conf/license/license-gplv2.inc

inherit gitpkgv
SRCREV = "${AUTOREV}"
PV = "${IMAGE_VERSION}+git${SRCPV}"
PKGV = "${IMAGE_VERSION}+git${GITPKGV}"
VER ="${IMAGE_VERSION}"
PR = "r1"

SRC_URI="git://github.com/openmips/skin-universe.git;protocol=git;branch=master"

S = "${WORKDIR}/git"

FILES_${PN} = "/usr/*"

CONFFILES_${PN} = " \
    /usr/share/enigma2/GBUniverseHD/construct/backgrounds/background-infobar.png \
    /usr/share/enigma2/GBUniverseHD/construct/backgrounds/background-symbol.png \
    /usr/share/enigma2/GBUniverseHD/construct/backgrounds/background-window.png \
    /usr/share/enigma2/GBUniverseHD/construct/backgrounds/background-window-details.png \
    /usr/share/enigma2/GBUniverseHD/construct/backgrounds/background-window-title.png \
    "

do_install() {
    cp -rp ${S}/usr ${D}/
}

do_package_qa[noexec] = "1"