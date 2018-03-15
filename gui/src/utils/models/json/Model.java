package utils.models.json;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private String name;
    private Integer imageSize;
    private Integer channels;
    private List<String> labels = new ArrayList<>();
    private Integer seed;
    private Integer iterations;
    private Boolean regularization;
    private Double learningRate;
    private Double l2;
    private String activation;
    private String weightInit;
    private String gradientNormalization;
    private String optimizationAlgo;
    private String updater;
    private Double momentum;
    private Boolean miniBatch;
    private List<Layer> layers = new ArrayList<>();
    
    public String getName () {
        return name;
    }
    
    public void setName (String name) {
        this.name = name;
    }
    
    public Integer getImageSize () {
        return imageSize;
    }
    
    public void setImageSize (Integer imageSize) {
        this.imageSize = imageSize;
    }
    
    public Integer getChannels () {
        return channels;
    }
    
    public void setChannels (Integer channels) {
        this.channels = channels;
    }
    
    public List<String> getLabels () {
        return labels;
    }
    
    public void setLabels (List<String> labels) {
        this.labels = labels;
    }
    
    public void addLabel (String label) {
        labels.add(label);
    }
    
    public Integer getSeed () {
        return seed;
    }
    
    public void setSeed (Integer seed) {
        this.seed = seed;
    }
    
    public Integer getIterations () {
        return iterations;
    }
    
    public void setIterations (Integer iterations) {
        this.iterations = iterations;
    }
    
    public Boolean getRegularization () {
        return regularization;
    }
    
    public void setRegularization (Boolean regularization) {
        this.regularization = regularization;
    }
    
    public Double getLearningRate () {
        return learningRate;
    }
    
    public void setLearningRate (Double learningRate) {
        this.learningRate = learningRate;
    }
    
    public Double getL2 () {
        return l2;
    }
    
    public void setL2 (Double l2) {
        this.l2 = l2;
    }
    
    public String getActivation () {
        return activation;
    }
    
    public void setActivation (String activation) {
        this.activation = activation;
    }
    
    public String getWeightInit () {
        return weightInit;
    }
    
    public void setWeightInit (String weightInit) {
        this.weightInit = weightInit;
    }
    
    public String getGradientNormalization () {
        return gradientNormalization;
    }
    
    public void setGradientNormalization (String gradientNormalization) {
        this.gradientNormalization = gradientNormalization;
    }
    
    public String getOptimizationAlgo () {
        return optimizationAlgo;
    }
    
    public void setOptimizationAlgo (String optimizationAlgo) {
        this.optimizationAlgo = optimizationAlgo;
    }
    
    public String getUpdater () {
        return updater;
    }
    
    public void setUpdater (String updater) {
        this.updater = updater;
    }
    
    public Double getMomentum () {
        return momentum;
    }
    
    public void setMomentum (Double momentum) {
        this.momentum = momentum;
    }
    
    public Boolean getMiniBatch () {
        return miniBatch;
    }
    
    public void setMiniBatch (Boolean miniBatch) {
        this.miniBatch = miniBatch;
    }
    
    public List<Layer> getLayers () {
        return layers;
    }
    
    public void setLayers (List<Layer> layers) {
        this.layers = layers;
    }
    
    public void addLayer (Layer layer) {
        layers.add(layer);
    }
}