package org.anefdef;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/**
 *
 * @param <E> the Type of the elements from a stream
 * @param <T> the Type of the attribute to make distinct and count
 */
public class DistinctCountingBy<E,T> implements Collector<E,Set<T>,Integer> {

    private final Function<E,T> function;

    public DistinctCountingBy(Function<E,T> function) {
        this.function = function;
    }

    @Override
    public Supplier<Set<T>> supplier() {
        return HashSet::new;
    }

    @Override
    public BiConsumer<Set<T>, E> accumulator() {
        return (res, elt) -> res.add(function.apply(elt));
    }

    @Override
    public BinaryOperator<Set<T>> combiner() {
        return (set1,set2) -> {
            set1.addAll(set2);
            return set1;
        };
    }

    @Override
    public Function<Set<T>, Integer> finisher() {
        return Set::size;
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Collections.emptySet();
    }
}
