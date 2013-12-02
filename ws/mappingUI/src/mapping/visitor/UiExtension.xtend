package mapping.visitor

import MMUI.AbstractContainer
import MMUI.CheckBox
import MMUI.Container
import MMUI.SuperContainer
import MMUI.Ui
import MMUI.Widget
import MMUI.RadioButton

static class UiExtension {
	
	def static void accept(Ui ui, UiVisitor visitor){
		visitor.entry(ui)
		var body = ui.body as SuperContainer
		body.accept(visitor)
		visitor.exit(ui)
	}
	
	def static void accept(SuperContainer superContainer, UiVisitor visitor){
		visitor.entry(superContainer)
		for(AbstractContainer ac : superContainer.containers){
			if(ac instanceof SuperContainer){
				var sc = ac as SuperContainer
				sc.accept(visitor)
			}
			else if(ac instanceof Container){
				var c = ac as Container
				c.accept(visitor)
			}
		}
		visitor.exit(superContainer)
	}
	
	def static void accept(Container container, UiVisitor visitor){
		visitor.entry(container)
		for(Widget widget : container.widgets){
			if(widget instanceof CheckBox){
				var check = widget as CheckBox
				check.accept(visitor)
			}
			else if(widget instanceof RadioButton){
				var radioButton = widget as RadioButton
				radioButton.accept(visitor)
			}
		}
		visitor.exit(container)
	}
	
	def static void accept(CheckBox checkbox, UiVisitor visitor){
		visitor.entry(checkbox)
		visitor.exit(checkbox)
	}
	
	def static void accept(RadioButton radioButton, UiVisitor visitor){
		visitor.entry(radioButton)
		visitor.exit(radioButton)
	}
}