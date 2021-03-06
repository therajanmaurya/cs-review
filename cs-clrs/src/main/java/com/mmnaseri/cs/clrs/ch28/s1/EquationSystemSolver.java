package com.mmnaseri.cs.clrs.ch28.s1;

import com.mmnaseri.cs.clrs.common.Matrix;

import java.util.List;

/**
 * @author Mohammad Milad Naseri (mmnaseri@programmer.net)
 * @since 1.0 (8/28/16, 3:07 PM)
 */
public interface EquationSystemSolver<E extends Number> {

    List<E> solve(Matrix<E> coefficients, List<E> values);

}
