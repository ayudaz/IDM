package mapping.visitor

import MMUI.CheckBox
import MMUI.Container
import MMUI.Image
import MMUI.RadioButton
import MMUI.Son
import MMUI.SuperContainer
import MMUI.Ui
import MMUI.Video
import MMUI.Widget

class UiVisitorImplAndroid implements UiVisitor {

	public String android;

	new() {
		android = "";
	}

	override entry(Ui ui) {
		android = android + '<?xml version="1.0" encoding="utf-8"?>
				<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
				    xmlns:tools="http://schemas.android.com/tools"
				    android:layout_width="match_parent"
				    android:layout_height="match_parent"
				    android:paddingBottom="@dimen/activity_vertical_margin"
				    android:paddingLeft="@dimen/activity_horizontal_margin"
				    android:paddingRight="@dimen/activity_horizontal_margin"
				    android:paddingTop="@dimen/activity_vertical_margin"
				    android:orientation="vertical">'
	}

	override exit(Ui ui) {
		android = android + "</LinearLayout>"
	}

	override entry(SuperContainer superContainer) {
		android = android + ' <LinearLayout
					        android:layout_width="match_parent"
					        android:layout_height="wrap_content"
					        android:orientation="vertical"
							android:id="@+id/'+superContainer.id+'" >'
	              
		if (superContainer.label != null) {
			android = android + '<TextView
				            android:layout_width="wrap_content"
				            android:layout_height="wrap_content"
				            android:text="'+superContainer.label+'"
				            android:textAppearance="?android:attr/textAppearanceLarge" />'
		}
	}

	override exit(SuperContainer superContainer) {
		android = android + '</LinearLayout>'
	}

	override entry(Container container) {
		android = android + '<TextView
				            android:layout_width="wrap_content"
				            android:layout_height="wrap_content"
				            android:id="@+id/'+container.id+'"
							android:text="'+container.label+'"
				            android:textAppearance="?android:attr/textAppearanceLarge" />'
	}

	override exit(Container container) {
		android = android
	}

	override entry(CheckBox checkbox) {
		android = android + ' <CheckBox
            android:id="@+id/checkBox1"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="'+checkbox.reponse+'" />'
	}

	override exit(CheckBox checkbox) {
		android = android
	}

	override entry(RadioButton radioButton) {
		android = android + '<RadioButton
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="'+radioButton.reponse+'" />'
	}

	override exit(RadioButton radioButton) {
		android = android
	}

	override entry(Image image) {
		this.entry(image.widget)
		android = android + '<ImageView
			            android:layout_width="wrap_content"
			            android:layout_height="wrap_content"
			            android:src="@drawable/'+image.widget.reponse+'" />'
	}

	override exit(Image image) {
	}

	override entry(Son son) {
		this.entry(son.widget)
		android = android + '<TextView
				            android:layout_width="wrap_content"
				            android:layout_height="wrap_content"
							android:text="Not implemented" />'
	}

	override exit(Son son) {
	}

	override entry(Video video) {
		this.entry(video.widget)
		android = android + '<TextView
				            android:layout_width="wrap_content"
				            android:layout_height="wrap_content"
							android:text="Not implemented" />'
	}

	override exit(Video video) {
	}

	def entry(Widget widget) {
		if (widget instanceof CheckBox) {
			var check = widget as CheckBox
			entry(check)
		} else if (widget instanceof RadioButton) {
			var radioButton = widget as RadioButton
			entry(radioButton)
		} else if (widget instanceof Image) {
			var image = widget as Image
			entry(image)
		}
	}
}
