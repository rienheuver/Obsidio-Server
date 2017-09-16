package com.benberi.cadesim.server.packet.in;

import com.benberi.cadesim.server.ServerContext;
import com.benberi.cadesim.server.codec.util.Packet;
import com.benberi.cadesim.server.model.player.Player;
import com.benberi.cadesim.server.packet.ServerPacketExecutor;

public class SealTogglePacket extends ServerPacketExecutor {

    public SealTogglePacket(ServerContext ctx) {
        super(ctx);
    }

    @Override
    public void execute(Player pl, Packet p) {
        boolean auto = p.readByte() == 1;
        pl.getMoveTokens().setAutomaticSealGeneration(auto);
    }
}
