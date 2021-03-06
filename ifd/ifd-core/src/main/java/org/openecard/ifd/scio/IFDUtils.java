/****************************************************************************
 * Copyright (C) 2012 ecsec GmbH.
 * All rights reserved.
 * Contact: ecsec GmbH (info@ecsec.de)
 *
 * This file is part of the Open eCard App.
 *
 * GNU General Public License Usage
 * This file may be used under the terms of the GNU General Public
 * License version 3.0 as published by the Free Software Foundation
 * and appearing in the file LICENSE.GPL included in the packaging of
 * this file. Please review the following information to ensure the
 * GNU General Public License version 3.0 requirements will be met:
 * http://www.gnu.org/copyleft/gpl.html.
 *
 * Other Usage
 * Alternatively, this file may be used in accordance with the terms
 * and conditions contained in a signed written agreement between
 * you and ecsec GmbH.
 *
 ***************************************************************************/

package org.openecard.ifd.scio;

import java.math.BigInteger;
import java.util.Arrays;


/**
 *
 * @author Johannes Schmoelz <johannes.schmoelz@ecsec.de>
 */
public class IFDUtils {

    /**
     * Extracts the slot index from the specified ifd name.
     * @param name Name of IFD
     * @return slot index
     * @throws IFDException
     */
    public static BigInteger getSlotIndex(String name) throws IFDException {
	return BigInteger.ZERO;
    }

    public static boolean arrayEquals(byte[] a, byte[] b) {
	if (a == null && b == null) {
	    return false;
	} else {
	    Boolean result = Arrays.equals(a, b);
	    return result.booleanValue();
	}
    }

}
