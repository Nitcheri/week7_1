/**
 * Precompiled [week7_1.java-common-conventions.gradle.kts][Week7_1_java_common_conventions_gradle] script plugin.
 *
 * @see Week7_1_java_common_conventions_gradle
 */
public
class Week7_1_javaCommonConventionsPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Week7_1_java_common_conventions_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
