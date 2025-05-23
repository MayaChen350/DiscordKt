package me.jakejmattson.discordkt

/** A container for data that saves type information. */
public interface TypeContainer

public class NoArgs : TypeContainer
public data class Args1<A>(val first: A) : TypeContainer
public data class Args2<A, B>(val first: A, val second: B) : TypeContainer
public data class Args3<A, B, C>(val first: A, val second: B, val third: C) : TypeContainer
public data class Args4<A, B, C, D>(val first: A, val second: B, val third: C, val fourth: D) : TypeContainer
public data class Args5<A, B, C, D, E>(val first: A, val second: B, val third: C, val fourth: D, val fifth: E) : TypeContainer
public data class Args6<A, B, C, D, E, F>(val first: A, val second: B, val third: C, val fourth: D, val fifth: E, val sixth: F) : TypeContainer
public data class Args7<A, B, C, D, E, F, G>(val first: A, val second: B, val third: C, val fourth: D, val fifth: E, val sixth: F, val seventh: G) : TypeContainer
public data class Args8<A, B, C, D, E, F, G, H>(val first: A, val second: B, val third: C, val fourth: D, val fifth: E, val sixth: F, val seventh: G, val eighth: H) : TypeContainer
public data class Args9<A, B, C, D, E, F, G, H, I>(val first: A, val second: B, val third: C, val fourth: D, val fifth: E, val sixth: F, val seventh: G, val eighth: H, val ninth: I) : TypeContainer
public data class Args10<A, B, C, D, E, F, G, H, I, J>(val first: A, val second: B, val third: C, val fourth: D, val fifth: E, val sixth: F, val seventh: G, val eighth: H, val ninth: I, val tenth: J) : TypeContainer
public data class Args11<A, B, C, D, E, F, G, H, I, J, K>(val first: A, val second: B, val third: C, val fourth: D, val fifth: E, val sixth: F, val seventh: G, val eighth: H, val ninth: I, val tenth: J, val eleventh: K) : TypeContainer
public data class Args12<A, B, C, D, E, F, G, H, I, J, K, L>(val first: A, val second: B, val third: C, val fourth: D, val fifth: E, val sixth: F, val seventh: G, val eighth: H, val ninth: I, val tenth: J, val eleventh: K, val twelfth: L) : TypeContainer
public data class Args13<A, B, C, D, E, F, G, H, I, J, K, L, M>(val first: A, val second: B, val third: C, val fourth: D, val fifth: E, val sixth: F, val seventh: G, val eighth: H, val ninth: I, val tenth: J, val eleventh: K, val twelfth: L, val thirteenth: M) : TypeContainer
public data class Args14<A, B, C, D, E, F, G, H, I, J, K, L, M, N>(val first: A, val second: B, val third: C, val fourth: D, val fifth: E, val sixth: F, val seventh: G, val eighth: H, val ninth: I, val tenth: J, val eleventh: K, val twelfth: L, val thirteenth: M, val fourteenth: N) : TypeContainer
public data class Args15<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O>(val first: A, val second: B, val third: C, val fourth: D, val fifth: E, val sixth: F, val seventh: G, val eighth: H, val ninth: I, val tenth: J, val eleventh: K, val twelfth: L, val thirteenth: M, val fourteenth: N, val fifteenth: O) : TypeContainer
public data class Args16<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P>(val first: A, val second: B, val third: C, val fourth: D, val fifth: E, val sixth: F, val seventh: G, val eighth: H, val ninth: I, val tenth: J, val eleventh: K, val twelfth: L, val thirteenth: M, val fourteenth: N, val fifteenth: O, val sixteenth: P) : TypeContainer
public data class Args17<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q>(val first: A, val second: B, val third: C, val fourth: D, val fifth: E, val sixth: F, val seventh: G, val eighth: H, val ninth: I, val tenth: J, val eleventh: K, val twelfth: L, val thirteenth: M, val fourteenth: N, val fifteenth: O, val sixteenth: P, val seventeenth: Q) : TypeContainer
public data class Args18<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R>(val first: A, val second: B, val third: C, val fourth: D, val fifth: E, val sixth: F, val seventh: G, val eighth: H, val ninth: I, val tenth: J, val eleventh: K, val twelfth: L, val thirteenth: M, val fourteenth: N, val fifteenth: O, val sixteenth: P, val seventeenth: Q, val eighteenth: R) : TypeContainer
public data class Args19<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S>(val first: A, val second: B, val third: C, val fourth: D, val fifth: E, val sixth: F, val seventh: G, val eighth: H, val ninth: I, val tenth: J, val eleventh: K, val twelfth: L, val thirteenth: M, val fourteenth: N, val fifteenth: O, val sixteenth: P, val seventeenth: Q, val eighteenth: R, val nineteenth: S) : TypeContainer
public data class Args20<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T>(val first: A, val second: B, val third: C, val fourth: D, val fifth: E, val sixth: F, val seventh: G, val eighth: H, val ninth: I, val tenth: J, val eleventh: K, val twelfth: L, val thirteenth: M, val fourteenth: N, val fifteenth: O, val sixteenth: P, val seventeenth: Q, val eighteenth: R, val nineteenth: S, val twentieth: T) : TypeContainer
public data class Args21<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U>(val first: A, val second: B, val third: C, val fourth: D, val fifth: E, val sixth: F, val seventh: G, val eighth: H, val ninth: I, val tenth: J, val eleventh: K, val twelfth: L, val thirteenth: M, val fourteenth: N, val fifteenth: O, val sixteenth: P, val seventeenth: Q, val eighteenth: R, val nineteenth: S, val twentieth: T, val twentyFirst: U) : TypeContainer
public data class Args22<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V>(val first: A, val second: B, val third: C, val fourth: D, val fifth: E, val sixth: F, val seventh: G, val eighth: H, val ninth: I, val tenth: J, val eleventh: K, val twelfth: L, val thirteenth: M, val fourteenth: N, val fifteenth: O, val sixteenth: P, val seventeenth: Q, val eighteenth: R, val nineteenth: S, val twentieth: T, val twentyFirst: U, val twentySecond: V) : TypeContainer
public data class Args23<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W>(val first: A, val second: B, val third: C, val fourth: D, val fifth: E, val sixth: F, val seventh: G, val eighth: H, val ninth: I, val tenth: J, val eleventh: K, val twelfth: L, val thirteenth: M, val fourteenth: N, val fifteenth: O, val sixteenth: P, val seventeenth: Q, val eighteenth: R, val nineteenth: S, val twentieth: T, val twentyFirst: U, val twentySecond: V, val twentyThird: W) : TypeContainer
public data class Args24<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X>(val first: A, val second: B, val third: C, val fourth: D, val fifth: E, val sixth: F, val seventh: G, val eighth: H, val ninth: I, val tenth: J, val eleventh: K, val twelfth: L, val thirteenth: M, val fourteenth: N, val fifteenth: O, val sixteenth: P, val seventeenth: Q, val eighteenth: R, val nineteenth: S, val twentieth: T, val twentyFirst: U, val twentySecond: V, val twentyThird: W, val twentyFourth: X) : TypeContainer
public data class Args25<A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y>(val first: A, val second: B, val third: C, val fourth: D, val fifth: E, val sixth: F, val seventh: G, val eighth: H, val ninth: I, val tenth: J, val eleventh: K, val twelfth: L, val thirteenth: M, val fourteenth: N, val fifteenth: O, val sixteenth: P, val seventeenth: Q, val eighteenth: R, val nineteenth: S, val twentieth: T, val twentyFirst: U, val twentySecond: V, val twentyThird: W, val twentyFourth: X, val twentyFifth: Y) : TypeContainer


internal fun bundleToContainer(arguments: List<Any?>) = when (arguments.size) {
    0 -> NoArgs()
    1 -> Args1(arguments[0])
    2 -> Args2(arguments[0], arguments[1])
    3 -> Args3(arguments[0], arguments[1], arguments[2])
    4 -> Args4(arguments[0], arguments[1], arguments[2], arguments[3])
    5 -> Args5(arguments[0], arguments[1], arguments[2], arguments[3], arguments[4])
    6 -> Args6(arguments[0], arguments[1], arguments[2], arguments[3], arguments[4], arguments[5])
    7 -> Args7(arguments[0], arguments[1], arguments[2], arguments[3], arguments[4], arguments[5], arguments[6])
    8 -> Args8(arguments[0], arguments[1], arguments[2], arguments[3], arguments[4], arguments[5], arguments[6], arguments[7])
    9 -> Args9(arguments[0], arguments[1], arguments[2], arguments[3], arguments[4], arguments[5], arguments[6], arguments[7], arguments[8])
    10 -> Args10(arguments[0], arguments[1], arguments[2], arguments[3], arguments[4], arguments[5], arguments[6], arguments[7], arguments[8], arguments[9])
    11 -> Args11(arguments[0], arguments[1], arguments[2], arguments[3], arguments[4], arguments[5], arguments[6], arguments[7], arguments[8], arguments[9], arguments[10])
    12 -> Args12(arguments[0], arguments[1], arguments[2], arguments[3], arguments[4], arguments[5], arguments[6], arguments[7], arguments[8], arguments[9], arguments[10], arguments[11])
    13 -> Args13(arguments[0], arguments[1], arguments[2], arguments[3], arguments[4], arguments[5], arguments[6], arguments[7], arguments[8], arguments[9], arguments[10], arguments[11], arguments[12])
    14 -> Args14(arguments[0], arguments[1], arguments[2], arguments[3], arguments[4], arguments[5], arguments[6], arguments[7], arguments[8], arguments[9], arguments[10], arguments[11], arguments[12], arguments[13])
    15 -> Args15(arguments[0], arguments[1], arguments[2], arguments[3], arguments[4], arguments[5], arguments[6], arguments[7], arguments[8], arguments[9], arguments[10], arguments[11], arguments[12], arguments[13], arguments[14])
    16 -> Args16(arguments[0], arguments[1], arguments[2], arguments[3], arguments[4], arguments[5], arguments[6], arguments[7], arguments[8], arguments[9], arguments[10], arguments[11], arguments[12], arguments[13], arguments[14], arguments[15])
    17 -> Args17(arguments[0], arguments[1], arguments[2], arguments[3], arguments[4], arguments[5], arguments[6], arguments[7], arguments[8], arguments[9], arguments[10], arguments[11], arguments[12], arguments[13], arguments[14], arguments[15], arguments[16])
    18 -> Args18(arguments[0], arguments[1], arguments[2], arguments[3], arguments[4], arguments[5], arguments[6], arguments[7], arguments[8], arguments[9], arguments[10], arguments[11], arguments[12], arguments[13], arguments[14], arguments[15], arguments[16], arguments[17])
    19 -> Args19(arguments[0], arguments[1], arguments[2], arguments[3], arguments[4], arguments[5], arguments[6], arguments[7], arguments[8], arguments[9], arguments[10], arguments[11], arguments[12], arguments[13], arguments[14], arguments[15], arguments[16], arguments[17], arguments[18])
    20 -> Args20(arguments[0], arguments[1], arguments[2], arguments[3], arguments[4], arguments[5], arguments[6], arguments[7], arguments[8], arguments[9], arguments[10], arguments[11], arguments[12], arguments[13], arguments[14], arguments[15], arguments[16], arguments[17], arguments[18], arguments[19])
    21 -> Args21(arguments[0], arguments[1], arguments[2], arguments[3], arguments[4], arguments[5], arguments[6], arguments[7], arguments[8], arguments[9], arguments[10], arguments[11], arguments[12], arguments[13], arguments[14], arguments[15], arguments[16], arguments[17], arguments[18], arguments[19], arguments[20])
    22 -> Args22(arguments[0], arguments[1], arguments[2], arguments[3], arguments[4], arguments[5], arguments[6], arguments[7], arguments[8], arguments[9], arguments[10], arguments[11], arguments[12], arguments[13], arguments[14], arguments[15], arguments[16], arguments[17], arguments[18], arguments[19], arguments[20], arguments[21])
    23 -> Args23(arguments[0], arguments[1], arguments[2], arguments[3], arguments[4], arguments[5], arguments[6], arguments[7], arguments[8], arguments[9], arguments[10], arguments[11], arguments[12], arguments[13], arguments[14], arguments[15], arguments[16], arguments[17], arguments[18], arguments[19], arguments[20], arguments[21], arguments[22])
    24 -> Args24(arguments[0], arguments[1], arguments[2], arguments[3], arguments[4], arguments[5], arguments[6], arguments[7], arguments[8], arguments[9], arguments[10], arguments[11], arguments[12], arguments[13], arguments[14], arguments[15], arguments[16], arguments[17], arguments[18], arguments[19], arguments[20], arguments[21], arguments[22], arguments[23])
    25 -> Args25(arguments[0], arguments[1], arguments[2], arguments[3], arguments[4], arguments[5], arguments[6], arguments[7], arguments[8], arguments[9], arguments[10], arguments[11], arguments[12], arguments[13], arguments[14], arguments[15], arguments[16], arguments[17], arguments[18], arguments[19], arguments[20], arguments[21], arguments[22], arguments[23], arguments[24])
    else -> when {
        arguments.size < 0 -> throw IllegalArgumentException("Cannot handle (${arguments.size}) arguments.")
        arguments.size > 25 -> throw IllegalArgumentException("Cannot handle more than 25 arguments.")
        else -> {}
    }
}