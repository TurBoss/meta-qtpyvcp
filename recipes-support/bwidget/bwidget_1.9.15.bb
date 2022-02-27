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
    install -d ${D}${libdir}/tcl8.6/${PN}-${PV}/
    cp -r ${S}/* ${D}${libdir}/tcl8.6/${PN}-${PV}/
}

PACKAGES = "${PN}"

FILES_${PN} += "\
  /usr \
  /usr/lib \
  /usr/lib/tcl8.6 \
  /usr/lib/tcl8.6/bwidget-1.9.15 \
  /usr/lib/tcl8.6/bwidget-1.9.15/bitmap.tcl \
  /usr/lib/tcl8.6/bwidget-1.9.15/panelframe.tcl \
  /usr/lib/tcl8.6/bwidget-1.9.15/progressdlg.tcl \
  /usr/lib/tcl8.6/bwidget-1.9.15/entry.tcl \
  /usr/lib/tcl8.6/bwidget-1.9.15/ChangeLog \
  /usr/lib/tcl8.6/bwidget-1.9.15/titleframe.tcl \
  /usr/lib/tcl8.6/bwidget-1.9.15/init.tcl \
  /usr/lib/tcl8.6/bwidget-1.9.15/scrollframe.tcl \
  /usr/lib/tcl8.6/bwidget-1.9.15/statusbar.tcl \
  /usr/lib/tcl8.6/bwidget-1.9.15/README.txt \
  /usr/lib/tcl8.6/bwidget-1.9.15/pkgIndex.tcl \
  /usr/lib/tcl8.6/bwidget-1.9.15/pagesmgr.tcl \
  /usr/lib/tcl8.6/bwidget-1.9.15/arrow.tcl \
  /usr/lib/tcl8.6/bwidget-1.9.15/scrollw.tcl \
  /usr/lib/tcl8.6/bwidget-1.9.15/progressbar.tcl \
  /usr/lib/tcl8.6/bwidget-1.9.15/scrollview.tcl \
  /usr/lib/tcl8.6/bwidget-1.9.15/buttonbox.tcl \
  /usr/lib/tcl8.6/bwidget-1.9.15/panedw.tcl \
  /usr/lib/tcl8.6/bwidget-1.9.15/README.md \
  /usr/lib/tcl8.6/bwidget-1.9.15/CHANGES.txt \
  /usr/lib/tcl8.6/bwidget-1.9.15/listbox.tcl \
  /usr/lib/tcl8.6/bwidget-1.9.15/xpm2image.tcl \
  /usr/lib/tcl8.6/bwidget-1.9.15/spinbox.tcl \
  /usr/lib/tcl8.6/bwidget-1.9.15/button.tcl \
  /usr/lib/tcl8.6/bwidget-1.9.15/color.tcl \
  /usr/lib/tcl8.6/bwidget-1.9.15/dynhelp.tcl \
  /usr/lib/tcl8.6/bwidget-1.9.15/widget.tcl \
  /usr/lib/tcl8.6/bwidget-1.9.15/combobox.tcl \
  /usr/lib/tcl8.6/bwidget-1.9.15/LICENSE.txt \
  /usr/lib/tcl8.6/bwidget-1.9.15/wizard.tcl \
  /usr/lib/tcl8.6/bwidget-1.9.15/dropsite.tcl \
  /usr/lib/tcl8.6/bwidget-1.9.15/separator.tcl \
  /usr/lib/tcl8.6/bwidget-1.9.15/passwddlg.tcl \
  /usr/lib/tcl8.6/bwidget-1.9.15/label.tcl \
  /usr/lib/tcl8.6/bwidget-1.9.15/font.tcl \
  /usr/lib/tcl8.6/bwidget-1.9.15/dragsite.tcl \
  /usr/lib/tcl8.6/bwidget-1.9.15/dialog.tcl \
  /usr/lib/tcl8.6/bwidget-1.9.15/mainframe.tcl \
  /usr/lib/tcl8.6/bwidget-1.9.15/tree.tcl \
  /usr/lib/tcl8.6/bwidget-1.9.15/_FOSSIL_ \
  /usr/lib/tcl8.6/bwidget-1.9.15/notebook.tcl \
  /usr/lib/tcl8.6/bwidget-1.9.15/messagedlg.tcl \
  /usr/lib/tcl8.6/bwidget-1.9.15/labelframe.tcl \
  /usr/lib/tcl8.6/bwidget-1.9.15/labelentry.tcl \
  /usr/lib/tcl8.6/bwidget-1.9.15/utils.tcl \
  /usr/lib/tcl8.6/bwidget-1.9.15/BWman \
  /usr/lib/tcl8.6/bwidget-1.9.15/lang \
  /usr/lib/tcl8.6/bwidget-1.9.15/images \
  /usr/lib/tcl8.6/bwidget-1.9.15/tests \
  /usr/lib/tcl8.6/bwidget-1.9.15/demo \
  /usr/lib/tcl8.6/bwidget-1.9.15/BWman/Tree.html \
  /usr/lib/tcl8.6/bwidget-1.9.15/BWman/LabelEntry.html \
  /usr/lib/tcl8.6/bwidget-1.9.15/BWman/Separator.html \
  /usr/lib/tcl8.6/bwidget-1.9.15/BWman/index.html \
  /usr/lib/tcl8.6/bwidget-1.9.15/BWman/LabelFrame.html \
  /usr/lib/tcl8.6/bwidget-1.9.15/BWman/Button.html \
  /usr/lib/tcl8.6/bwidget-1.9.15/BWman/Label.html \
  /usr/lib/tcl8.6/bwidget-1.9.15/BWman/ScrollableFrame.html \
  /usr/lib/tcl8.6/bwidget-1.9.15/BWman/PasswdDlg.html \
  /usr/lib/tcl8.6/bwidget-1.9.15/BWman/NoteBook.html \
  /usr/lib/tcl8.6/bwidget-1.9.15/BWman/ProgressDlg.html \
  /usr/lib/tcl8.6/bwidget-1.9.15/BWman/navtree.html \
  /usr/lib/tcl8.6/bwidget-1.9.15/BWman/ComboBox.html \
  /usr/lib/tcl8.6/bwidget-1.9.15/BWman/contents.html \
  /usr/lib/tcl8.6/bwidget-1.9.15/BWman/SelectColor.html \
  /usr/lib/tcl8.6/bwidget-1.9.15/BWman/Dialog.html \
  /usr/lib/tcl8.6/bwidget-1.9.15/BWman/options.htm \
  /usr/lib/tcl8.6/bwidget-1.9.15/BWman/SpinBox.html \
  /usr/lib/tcl8.6/bwidget-1.9.15/BWman/ScrollView.html \
  /usr/lib/tcl8.6/bwidget-1.9.15/BWman/Widget.html \
  /usr/lib/tcl8.6/bwidget-1.9.15/BWman/StatusBar.html \
  /usr/lib/tcl8.6/bwidget-1.9.15/BWman/ButtonBox.html \
  /usr/lib/tcl8.6/bwidget-1.9.15/BWman/DragSite.html \
  /usr/lib/tcl8.6/bwidget-1.9.15/BWman/PanedWindow.html \
  /usr/lib/tcl8.6/bwidget-1.9.15/BWman/TitleFrame.html \
  /usr/lib/tcl8.6/bwidget-1.9.15/BWman/PanelFrame.html \
  /usr/lib/tcl8.6/bwidget-1.9.15/BWman/DropSite.html \
  /usr/lib/tcl8.6/bwidget-1.9.15/BWman/MainFrame.html \
  /usr/lib/tcl8.6/bwidget-1.9.15/BWman/ScrolledWindow.html \
  /usr/lib/tcl8.6/bwidget-1.9.15/BWman/ProgressBar.html \
  /usr/lib/tcl8.6/bwidget-1.9.15/BWman/DynamicHelp.html \
  /usr/lib/tcl8.6/bwidget-1.9.15/BWman/ArrowButton.html \
  /usr/lib/tcl8.6/bwidget-1.9.15/BWman/Entry.html \
  /usr/lib/tcl8.6/bwidget-1.9.15/BWman/SelectFont.html \
  /usr/lib/tcl8.6/bwidget-1.9.15/BWman/BWidget.html \
  /usr/lib/tcl8.6/bwidget-1.9.15/BWman/ListBox.html \
  /usr/lib/tcl8.6/bwidget-1.9.15/BWman/PagesManager.html \
  /usr/lib/tcl8.6/bwidget-1.9.15/BWman/MessageDlg.html \
  /usr/lib/tcl8.6/bwidget-1.9.15/lang/pl.rc \
  /usr/lib/tcl8.6/bwidget-1.9.15/lang/hu.rc \
  /usr/lib/tcl8.6/bwidget-1.9.15/lang/de.rc \
  /usr/lib/tcl8.6/bwidget-1.9.15/lang/fr.rc \
  /usr/lib/tcl8.6/bwidget-1.9.15/lang/es.rc \
  /usr/lib/tcl8.6/bwidget-1.9.15/lang/en.rc \
  /usr/lib/tcl8.6/bwidget-1.9.15/lang/no.rc \
  /usr/lib/tcl8.6/bwidget-1.9.15/lang/da.rc \
  /usr/lib/tcl8.6/bwidget-1.9.15/lang/nl.rc \
  /usr/lib/tcl8.6/bwidget-1.9.15/images/minus.xbm \
  /usr/lib/tcl8.6/bwidget-1.9.15/images/dragicon.gif \
  /usr/lib/tcl8.6/bwidget-1.9.15/images/palette.gif \
  /usr/lib/tcl8.6/bwidget-1.9.15/images/paste.gif \
  /usr/lib/tcl8.6/bwidget-1.9.15/images/open.gif \
  /usr/lib/tcl8.6/bwidget-1.9.15/images/dragfile.gif \
  /usr/lib/tcl8.6/bwidget-1.9.15/images/openfold.gif \
  /usr/lib/tcl8.6/bwidget-1.9.15/images/opmove.xbm \
  /usr/lib/tcl8.6/bwidget-1.9.15/images/new.gif \
  /usr/lib/tcl8.6/bwidget-1.9.15/images/opcopy.xbm \
  /usr/lib/tcl8.6/bwidget-1.9.15/images/print.gif \
  /usr/lib/tcl8.6/bwidget-1.9.15/images/italic.gif \
  /usr/lib/tcl8.6/bwidget-1.9.15/images/warning.gif \
  /usr/lib/tcl8.6/bwidget-1.9.15/images/hourglass.gif \
  /usr/lib/tcl8.6/bwidget-1.9.15/images/bold.gif \
  /usr/lib/tcl8.6/bwidget-1.9.15/images/file.gif \
  /usr/lib/tcl8.6/bwidget-1.9.15/images/undo.gif \
  /usr/lib/tcl8.6/bwidget-1.9.15/images/plus.xbm \
  /usr/lib/tcl8.6/bwidget-1.9.15/images/underline.gif \
  /usr/lib/tcl8.6/bwidget-1.9.15/images/copy.gif \
  /usr/lib/tcl8.6/bwidget-1.9.15/images/redo.gif \
  /usr/lib/tcl8.6/bwidget-1.9.15/images/save.gif \
  /usr/lib/tcl8.6/bwidget-1.9.15/images/folder.gif \
  /usr/lib/tcl8.6/bwidget-1.9.15/images/info.gif \
  /usr/lib/tcl8.6/bwidget-1.9.15/images/target.xbm \
  /usr/lib/tcl8.6/bwidget-1.9.15/images/cut.gif \
  /usr/lib/tcl8.6/bwidget-1.9.15/images/overstrike.gif \
  /usr/lib/tcl8.6/bwidget-1.9.15/images/question.gif \
  /usr/lib/tcl8.6/bwidget-1.9.15/images/passwd.gif \
  /usr/lib/tcl8.6/bwidget-1.9.15/images/oplink.xbm \
  /usr/lib/tcl8.6/bwidget-1.9.15/images/error.gif \
  /usr/lib/tcl8.6/bwidget-1.9.15/tests/entry.test \
  /usr/lib/tcl8.6/bwidget-1.9.15/demo/x1.xbm \
  /usr/lib/tcl8.6/bwidget-1.9.15/demo/bwidget.xbm \
  /usr/lib/tcl8.6/bwidget-1.9.15/demo/manager.tcl \
  /usr/lib/tcl8.6/bwidget-1.9.15/demo/select.tcl \
  /usr/lib/tcl8.6/bwidget-1.9.15/demo/demo.tcl \
  /usr/lib/tcl8.6/bwidget-1.9.15/demo/dnd.tcl \
  /usr/lib/tcl8.6/bwidget-1.9.15/demo/tree.tcl \
  /usr/lib/tcl8.6/bwidget-1.9.15/demo/tmpldlg.tcl \
  /usr/lib/tcl8.6/bwidget-1.9.15/demo/basic.tcl"
 