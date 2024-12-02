package ru.itis.blockchain;

import lombok.Builder;
import lombok.Data;

import java.security.Signature;
import java.security.Timestamp;

@Data
@Builder
public class Block {

    private final DataBlock dataBlock;
    private final Timestamp timestamp;
    private final Signature signature;

}
