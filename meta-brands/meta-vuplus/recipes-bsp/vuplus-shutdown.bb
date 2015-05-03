require conf/license/license-gplv2.inc

PV = "1.0"
PR = "r3"

SRC_URI = " \
    file://turnoff_power \
    file://vuplus-shutdown.sh "

S = "${WORKDIR}"

INITSCRIPT_NAME = "vuplus-shutdown"
INITSCRIPT_PARAMS = "start 89 0 ."

inherit autotools pkgconfig update-rc.d

do_install() {
    install -d ${D}/etc/init.d/
    install -m 0755 ${WORKDIR}/vuplus-shutdown.sh ${D}/etc/init.d/vuplus-shutdown
    install -d ${D}/usr/bin
    install -m 0755 ${WORKDIR}/turnoff_power ${D}/usr/bin
}

pkg_preinst_${PN}_prepend() {
#!/bin/sh
chmod -x $D/etc/init.d/vuplus-shutdown
}

pkg_postinst_${PN}_append() {
#!/bin/sh
chmod 755 $D/etc/init.d/vuplus-shutdown
}

pkg_prerm_${PN}() {
#!/bin/sh
exit 0
}

PACKAGE_ARCH = "${MACHINE_ARCH}"
