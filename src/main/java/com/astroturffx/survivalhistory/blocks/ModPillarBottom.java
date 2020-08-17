package com.astroturffx.survivalhistory.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

public class ModPillarBottom extends Block {
    public ModPillarBottom(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return VoxelShapes.combineAndSimplify(Block.makeCuboidShape(0, 0, 0, 16, 4, 16), Block.makeCuboidShape(2, 4, 2, 14, 16, 14), IBooleanFunction.OR);
    }
}
