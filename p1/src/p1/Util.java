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
package p1;

import java.util.Collection;
import java.util.Iterator;

/**
 * Type comment.
 * @author Russ Tennant (russ@i2rd.com)
 */
public class Util
{

    /**
     * TODO
     * @param string
     * @return 
     */
    public static String toString(final Collection<? extends Object> collection, final String delimiter)
    {
        final StringBuilder s = new StringBuilder();
        final Iterator<? extends Object> it = collection.iterator();
        while(it.hasNext())
        {
            s.append(it.next());
            if(it.hasNext()) s.append(delimiter);
        }
        return s.toString();
    }
    
}
