package com.sanda.base.file;

import com.sanda.base.PojaGenerated;

@PojaGenerated
public record FileHash(FileHashAlgorithm algorithm, String value) {}
