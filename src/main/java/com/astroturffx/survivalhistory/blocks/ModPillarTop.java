package com.astroturffx.survivalhistory.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

public class ModPillarTop extends Block {
    public ModPillarTop(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return VoxelShapes.combineAndSimplify(Block.makeCuboidShape(2, 0, 2, 14, 12, 14), Block.makeCuboidShape(0, 12, 0, 16, 16, 16), IBooleanFunction.OR);
    }
}
