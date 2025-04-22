package dev.langchain4j.model.googleai;

import dev.langchain4j.Experimental;

@Experimental
public class GeminiThinkingConfig {

    private final Boolean enabled;
    
    public GeminiThinkingConfig(Boolean enabled) {
        this.enabled = enabled;
    }
    
    public static GeminiThinkingConfigBuilder builder() {
        return new GeminiThinkingConfigBuilder();
    }
    
    public Boolean getEnabled() {
        return enabled;
    }
    
    public static class GeminiThinkingConfigBuilder {
        private Boolean enabled;
        
        GeminiThinkingConfigBuilder() {
        }
        
        public GeminiThinkingConfigBuilder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        
        public GeminiThinkingConfig build() {
            return new GeminiThinkingConfig(this.enabled);
        }
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GeminiThinkingConfig that = (GeminiThinkingConfig) o;
        return java.util.Objects.equals(enabled, that.enabled);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(enabled);
    }
    
    @Override
    public String toString() {
        return "GeminiThinkingConfig(enabled=" + enabled + ")";
    }
}
