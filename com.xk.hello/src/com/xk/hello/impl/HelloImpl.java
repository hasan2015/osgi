/**
 * 
 */
package com.xk.hello.impl;

import com.xk.hello.Hello;

/**
 * @author Hasan
 * @date 2016��5��3��
 */
public class HelloImpl implements Hello {
	final String helloString;
	public HelloImpl(String helloString){
	    this.helloString = helloString;
	}
	/* (non-Javadoc)
	 * @see com.xk.hello.Hello#sayHello()
	 */
	@Override
	public void sayHello() {
		 System.out.println(this.helloString);
	}

}
