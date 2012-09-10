/* Copyright (C) 2012 D. R. Commander.  All Rights Reserved.
 *
 * This is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this software; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301,
 * USA.
 */

package com.turbovnc.rdr;

public class NullOutStream extends OutStream {

  public void writeU8( int u) {}
  public void writeU16(int u) {}
  public void writeU32(int u) {}
  public void writeOpaque24A(int u) {}
  public void writeOpaque24B(int u) {}
  public void writeBytes(byte[] data, int dataPtr, int length) {}
  public int length() { return 0; }
  public int overrun(int itemSize, int nItems) { return nItems; }
}