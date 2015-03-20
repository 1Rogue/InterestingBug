/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codelanx.interestingbug;

import com.codelanx.interestingbug.types.ParentType;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Class description for {@link InstanceHolder}
 *
 * @since 1.0.0
 * @author 1Rogue
 * @version 1.0.0
 */
public class InstanceHolder<D extends ParentType> {

    private final Class<D> dataClass;
    private volatile D value = null;

    public InstanceHolder(Class<D> dataClass) {
        this.dataClass = dataClass;
    }
    
    public D get(MyBugInterface source) {
        if (this.value == null) {
            synchronized (this) {
                if (this.value == null) {
                    try {
                        this.value = this.dataClass.newInstance();
                    } catch (InstantiationException ex) {
                        System.err.println("Error creating test case");
                    } catch (IllegalAccessException ex) {
                        System.err.println("Error creating test case");
                    }
                }
            }
        }
        return this.value;
    }

}