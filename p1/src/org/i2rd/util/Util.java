/*
 *  Copyright (c) Interactive Information R & D (I2RD) LLC.
 *  All Rights Reserved.
 *   
 *  This software is confidential and proprietary information of
 *  I2RD LLC ("Confidential Information"). You shall not disclose
 *  such Confidential Information and shall use it only in 
 *  accordance with the terms of the license agreement you entered
 *  into with I2RD.
 */
package org.i2rd.util;

import java.util.Collection;
import java.util.Iterator;

/**
 * Utility functions.
 * @author Russ Tennant (russ@i2rd.com)
 */
public class Util
{

    /**
     * Convert the array to a string with the specified delimiter.
     * @param array the array to convert. asd
     * @param delimiter the delimiter.
     * @return the delimited string. 
     */
    public static String toString(final Object[] array, final String delimiter)
    {
        final StringBuilder s = new StringBuilder();
        for (int i = 0, ib = array.length-1; i <= ib; i++)
        {
            s.append(array[i]);
            if(i < ib) 
                s.append(delimiter);   
        }
        return s.toString();
    }
    
    
    /**
     * Convert the collection to a string with the specified delimiter.
     * @param collection the collection to convert.
     * @param delimiter the delimiter.
     * @return the delimited string.
     */
    public static String toString(final Collection<? extends Object> collection, final String delimiter)
    {
        final StringBuilder s = new StringBuilder();
        final Iterator<? extends Object> it = collection.iterator();
        while(it.hasNext())
        {
            s.append(it.next());
            if(it.hasNext()) 
                s.append(delimiter);
        }
        return s.toString();
    }
    
}
