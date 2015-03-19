package com.mode.abstractFactory;

import com.mode.factoryMethod.Page;

public interface Factory {
	Pen producePen();
	Page producePage();
}
