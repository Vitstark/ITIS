package ru.itis.blockchain;

import lombok.Builder;
import lombok.Data;

import java.security.Signature;

@Data
@Builder
public class DataBlock {

    private final String data;
    private final byte[] previousHash;
    private final Signature signature;
}
