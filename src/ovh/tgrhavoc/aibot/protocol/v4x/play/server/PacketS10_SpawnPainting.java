/*******************************************************************************
 *     Copyright (C) 2015 Jordan Dalton (jordan.8474@gmail.com)
 *
 *     This program is free software; you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation; either version 2 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License along
 *     with this program; if not, write to the Free Software Foundation, Inc.,
 *     51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *******************************************************************************/
package ovh.tgrhavoc.aibot.protocol.v4x.play.server;

import java.io.*;

import ovh.tgrhavoc.aibot.protocol.*;
import ovh.tgrhavoc.aibot.protocol.ProtocolX.State;

public class PacketS10_SpawnPainting extends AbstractPacketX implements ReadablePacket {
	private int entityId;
	private String title;
	private int x, y, z, face;

	public PacketS10_SpawnPainting() {
		super(0x10, State.PLAY, Direction.DOWNSTREAM);
	}

	@Override
	public void readData(DataInputStream in) throws IOException {
		entityId = readVarInt(in);
		title = readString(in);

		x = in.readInt();
		y = in.readInt();
		z = in.readInt();
		face = in.readInt();
	}

	public int getEntityId() {
		return entityId;
	}

	public String getTitle() {
		return title;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getZ() {
		return z;
	}

	public int getFace() {
		return face;
	}
}
