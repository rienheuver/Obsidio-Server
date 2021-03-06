package com.benberi.cadesim.server.codec.packet.out;

import com.benberi.cadesim.server.ServerContext;
import com.benberi.cadesim.server.codec.util.Packet;
import com.benberi.cadesim.server.model.player.Player;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;

public abstract class OutgoingPacket extends Packet {

    public OutgoingPacket(int opcode) {
        super(opcode);
    }

    public void send(Player p) {
        encode();
        p.getChannel().write(this);
    }

    /**
     * Encodes the packet
     */
    public abstract void encode();
}
