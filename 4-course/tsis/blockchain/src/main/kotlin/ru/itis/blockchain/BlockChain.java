package ru.itis.blockchain;

import lombok.RequiredArgsConstructor;

import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@RequiredArgsConstructor
public class BlockChain {

    private final KeyGenerator keyGenerator;
    private final MessageDigest hasher;
    private final DataSource dataSource;

    private final List<Block> blocks = new ArrayList<>();

    public void init() {
        blocks.addAll(dataSource.getAll());
    }

    public String get(byte[] hash) {
        int i = 0;
        for (Block block : blocks) {
            hasher
        }

        throw new NoSuchElementException("Нет элемента с таким хэшем");
    }

}
