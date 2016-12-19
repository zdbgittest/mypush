package com.hx.push;

import nl.justobjects.pushlet.core.Event;
import nl.justobjects.pushlet.core.EventPullSource;

public class HelloWorldPlushlet {
	static public class HwPlushlet extends EventPullSource {
		// 休眠五秒
		@Override
		protected long getSleepTime() {
			return 1000;
		}
		@Override
		protected Event pullEvent() {
			System.out.println("开始推送了");
			Event event = Event.createDataEvent("/cuige/he");
			event.setField("mess", "hello,world!Plushlet!");
			return event;
		}
	}
}
