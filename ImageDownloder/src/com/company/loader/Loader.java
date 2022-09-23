package com.company.loader;

import com.company.commands.*;

import java.util.Set;

public class Loader {
    public static final Set<Command> classes = Set.of(new GrayScale(),new
            Preview(),new ThumbNail());
}
