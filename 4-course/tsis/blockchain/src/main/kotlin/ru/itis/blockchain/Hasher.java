package ru.itis.blockchain;

import lombok.RequiredArgsConstructor;
import sun.jvm.hotspot.runtime.Bytes;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SignatureException;

@RequiredArgsConstructor
public class Hasher {

    private final MessageDigest messageDigest;

    public byte[] hash(Block block) throws SignatureException {
        ByteBuffer buffer = ByteBuffer
                .wrap(block.getDataBlock().getPreviousHash())
                .put(block.getDataBlock().getData().getBytes(StandardCharsets.UTF_8))
                .put(block.getDataBlock().getSignature().sign())
                .put(block.getSignature());
        return messageDigest.digest(buffer.array());
    }

}
