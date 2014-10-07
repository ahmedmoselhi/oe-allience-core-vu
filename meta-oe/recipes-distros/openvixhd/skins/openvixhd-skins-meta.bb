SUMMARY = "Manage HD skins for OE-Alliance feeds."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

ALLOW_EMPTY_${PN} = "1"
PACKAGES = "${PN}"

PV = "1.0"
PR = "0"

inherit packagegroup

DEPENDS = "enigma2 enigma2-plugin-vixhd-skins"

RDEPENDS_${PN} = "\
    enigma2-plugin-skins-youvix-blue \
    enigma2-plugin-skins-youvix-red \
    "
