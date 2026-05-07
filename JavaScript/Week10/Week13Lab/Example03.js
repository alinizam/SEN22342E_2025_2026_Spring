const createConfigManager = (function () {
    let instance = null;

    return function () {
        if (instance) return instance;
        const settings = {};
        instance = {
            set(key, value) {
                settings[key] = value;
            },
            get(key){
                return settings[key];
            }
        };
        return instance
    }
})();

const confA=createConfigManager();
confA.set("thema","dark");
console.log(confA.get("thema"));
const confB=createConfigManager();
console.log(confB===confA)
console.log(confB.get("thema"));

