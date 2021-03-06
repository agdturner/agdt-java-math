/*
 * Copyright 2020 Andy Turner, University of Leeds.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Provides some general mathematics functionality.
 */
module uk.ac.leeds.ccg.math {
    requires transitive java.logging;
    requires java.desktop;
    
    /**
     * The big-math library is mostly used for representing and computing with
     * rational numbers as {@link ch.obermuhlner.math.big.BigRational}. It is
     * also for some functions that work on {@link java.math.BigDecimal}.
     */
    requires ch.obermuhlner.math.big;

    /**
     * The agdt-java-generic library is used for some general functionality.
     */
    requires uk.ac.leeds.ccg.generic;
    
    /**
     * Exports.
     */
    exports uk.ac.leeds.ccg.math;
    exports uk.ac.leeds.ccg.math.core;
    exports uk.ac.leeds.ccg.math.io;
    exports uk.ac.leeds.ccg.math.matrices;
    exports uk.ac.leeds.ccg.math.primes;
}