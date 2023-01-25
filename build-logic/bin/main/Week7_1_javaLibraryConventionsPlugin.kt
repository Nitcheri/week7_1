/**
 * Precompiled [week7_1.java-library-conventions.gradle.kts][Week7_1_java_library_conventions_gradle] script plugin.
 *
 * @see Week7_1_java_library_conventions_gradle
 */
public
class Week7_1_javaLibraryConventionsPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Week7_1_java_library_conventions_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
