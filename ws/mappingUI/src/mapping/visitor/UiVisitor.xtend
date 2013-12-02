package mapping.visitor

import MMUI.CheckBox
import MMUI.Container
import MMUI.RadioButton
import MMUI.SuperContainer
import MMUI.Ui

interface UiVisitor {
	def void entry(Ui ui)
	def void exit(Ui ui)
	def void entry(SuperContainer superContainer)
	def void exit(SuperContainer superContainer)
	def void entry(Container container)
	def void exit(Container container)
	def void entry(CheckBox checkbox)
	def void exit(CheckBox checkbox)
	def void entry(RadioButton radioButton)
	def void exit(RadioButton radioButton)
}