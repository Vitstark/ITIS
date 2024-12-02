package ru.itis.blockchain;

import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.List;

@RequiredArgsConstructor
public class DataSource {

    public @NotNull List<Block> getAll() {
        return Collections.emptyList();
    }

    public void addBlock(Block block) {

    }
}
