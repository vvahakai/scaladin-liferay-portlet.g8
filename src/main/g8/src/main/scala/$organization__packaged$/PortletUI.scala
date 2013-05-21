package $organization$

import vaadin.scala._

class PortletUI extends UI {
  content = Button("Click me!", Notification.show("Hello, this is $name$!"))
}
