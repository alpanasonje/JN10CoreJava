package com.tns.dayeight.extendinginterfaces;

import com.tns.dayeight.functionalinterfaces.GreetInterface;

public interface ChildInterface extends ParentInterface, GreetInterface {
	void display();
}
