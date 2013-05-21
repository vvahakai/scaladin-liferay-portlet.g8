package com.arcusys.scaladinboten

import vaadin.scala._

class ScaladinBotenUI extends UI {
  content = Button("Click me!", Notification.show("Hello World!"))
}
