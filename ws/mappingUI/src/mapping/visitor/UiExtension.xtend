package mapping.visitor

import MMUI.AbstractContainer
import MMUI.CheckBox
import MMUI.Container
import MMUI.Image
import MMUI.RadioButton
import MMUI.SuperContainer
import MMUI.Ui
import MMUI.Widget
import MMUI.Son
import MMUI.Video

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
			} else if(widget instanceof Image){
				var image = widget as Image
				image.accept(visitor)				
			}
			else if(widget instanceof Son){
				var son = widget as Son
				son.accept(visitor)				
			}
			else if(widget instanceof Video){
				var video = widget as Video
				video.accept(visitor)				
			}
		}
		visitor.exit(container)
	}
	
	def static void accept(Video video, UiVisitor visitor){
		visitor.entry(video)
		visitor.exit(video)
	}
	
	def static void accept(Son son, UiVisitor visitor){
		visitor.entry(son)
		visitor.exit(son)
	}
	
	def static void accept(Image image, UiVisitor visitor){
		visitor.entry(image)
		visitor.exit(image)
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