//Code source: https://github.com/TechReborn/RebornCore/blob/9c8bc76765dd66b9fff519c2f51a1e5c1516dd0a/src/main/java/reborncore/common/world/CustomOreFeatureConfig.java
/*
 * This file is part of TechReborn, licensed under the MIT License (MIT).
 *
 * Copyright (c) 2020 TechReborn
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package net.enderitemc.enderitemod.oreGeneration;

import net.minecraft.block.BlockState;
import net.minecraft.predicate.block.BlockPredicate;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.function.Predicate;

public class EndOreFeatureConfig extends OreFeatureConfig {

    Predicate<BlockState> blockPredicate;

    public EndOreFeatureConfig(BlockPredicate blockPredicate, BlockState blockState, int size) {
        super(null, blockState, size);
        this.blockPredicate = blockPredicate;
    }

}