package mapping.visitor

import MMUI.CheckBox
import MMUI.Container
import MMUI.RadioButton
import MMUI.SuperContainer
import MMUI.Ui
import MMUI.Image
import MMUI.Son
import MMUI.Video

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
	def void entry(Image image)
	def void exit(Image image)
	def void entry(Son son)
	def void exit(Son son)
	def void entry(Video video)
	def void exit(Video video)
}