package kamkeel.npcdbc.client.model.part;

import kamkeel.npcdbc.client.model.ModelDBCPartInterface;
import kamkeel.npcdbc.constants.DBCRace;
import kamkeel.npcdbc.data.form.Form;
import kamkeel.npcdbc.data.npc.DBCDisplay;
import net.minecraft.client.model.ModelRenderer;
import noppes.npcs.client.model.ModelMPM;
import noppes.npcs.entity.data.ModelData;
import noppes.npcs.entity.data.ModelPartData;

public class DBCHorns extends ModelDBCPartInterface {
    // First Form
    public ModelRenderer FirstFormSpikes;
    public ModelRenderer spikePairOne;
    public ModelRenderer spikePairTwo;

    // Second Form
    public ModelRenderer SecondFormSpikes;
    public ModelRenderer spikePairThree;
    public ModelRenderer spikePairFour;

    // Third Form
    public ModelRenderer ThirdFormBigHead;
    public ModelRenderer bigHead1;
    public ModelRenderer bigHead2;
    public ModelRenderer bigHead3;
    public ModelRenderer bigHead4;

    // Cooler Form
    public ModelRenderer CoolerHeadSpikes;
    public ModelRenderer spike1;
    public ModelRenderer spike2;

    public ModelRenderer NamekianAntennas;
    public ModelRenderer antenna1;
    public ModelRenderer antenna2;

    public DBCHorns(ModelMPM par1ModelBase) {
        super(par1ModelBase);

        FirstFormSpikes = new ModelRenderer(par1ModelBase, 0, 0);
        FirstFormSpikes.addBox(0F, 0F, 0F, 0, 0, 0);
        FirstFormSpikes.setRotationPoint(0F, 0F, 0F);

        spikePairOne = new ModelRenderer(par1ModelBase, 0, 0);
        spikePairOne.addBox(-3F, -9F, -4F, 2, 4, 2);
        spikePairOne.setRotationPoint(0F, 0F, 0F);

        spikePairTwo = new ModelRenderer(par1ModelBase, 0, 0);
        spikePairTwo.addBox(1F, -9F, -4F, 2, 4, 2);
        spikePairTwo.setRotationPoint(0F, 0F, 0F);

        FirstFormSpikes.addChild(spikePairOne);
        FirstFormSpikes.addChild(spikePairTwo);

        SecondFormSpikes = new ModelRenderer(par1ModelBase, 0, 0);
        SecondFormSpikes.addBox(0F, 0F, 0F, 0, 0, 0);
        SecondFormSpikes.setRotationPoint(0F, 0F, 0F);

        spikePairThree = new ModelRenderer(par1ModelBase, 0, 0);
        spikePairThree.addBox(1F, -9F, -4F, 2, 5, 2);
        spikePairThree.setTextureOffset(33, 2);
        spikePairThree.addBox(1F, -12F, -2F, 2, 3, 2);
        spikePairThree.setRotationPoint(0F, 0F, 0F);
        setRotation(spikePairThree, 0.5235988F, 0F, 0F);

        spikePairFour = new ModelRenderer(par1ModelBase, 0, 0);
        spikePairFour.addBox(-3F, -9F, -4F, 2, 5, 2);
        spikePairFour.setTextureOffset(33, 2);
        spikePairFour.addBox(-3F, -12F, -2F, 2, 3, 2);
        spikePairFour.setRotationPoint(0F, 0F, 0F);
        setRotation(spikePairFour, 0.5235988F, 0F, 0F);

        SecondFormSpikes.addChild(spikePairThree);
        SecondFormSpikes.addChild(spikePairFour);

        ThirdFormBigHead = new ModelRenderer(par1ModelBase, 0, 0);
        ThirdFormBigHead.addBox(0F, 0F, 0F, 0, 0, 0);
        ThirdFormBigHead.setRotationPoint(0F, 0F, 0F);

        bigHead1 = new ModelRenderer(par1ModelBase, 24, 0);
        bigHead1.addBox(-1F, -10F, -4F, 2, 4, 8);
        bigHead1.setRotationPoint(0F, 0F, 0F);

        bigHead2 = new ModelRenderer(par1ModelBase, 24, 0);
        bigHead2.addBox(-1F, -11F, -3F, 2, 1, 7);
        bigHead2.setRotationPoint(0F, 0F, 0F);

        bigHead3 = new ModelRenderer(par1ModelBase, 24, 0);
        bigHead3.addBox(-1F, -10F, 4F, 2, 3, 3);
        bigHead3.setRotationPoint(0F, 0F, 0F);

        bigHead4 = new ModelRenderer(par1ModelBase, 24, 0);
        bigHead4.addBox(-1F, -10F, 7F, 2, 2, 2);
        bigHead4.setRotationPoint(0F, 0F, 0F);

        ThirdFormBigHead.addChild(bigHead1);
        ThirdFormBigHead.addChild(bigHead2);
        ThirdFormBigHead.addChild(bigHead3);
        ThirdFormBigHead.addChild(bigHead4);

        CoolerHeadSpikes = new ModelRenderer(par1ModelBase, 0, 0);
        CoolerHeadSpikes.addBox(0F, 0F, 0F, 0, 0, 0);
        CoolerHeadSpikes.setRotationPoint(0F, 0F, 0F);

        spike1 = new ModelRenderer(par1ModelBase, 0, 0);
        spike1.addBox(4F, -7F, 0F, 1, 3, 2);
        spike1.setRotationPoint(0F, 0F, 0F);
        setRotation(spike1, 0F, 0F, 0.3665191F);

        spike2 = new ModelRenderer(par1ModelBase, 0, 0);
        spike2.addBox(-5F, -7F, 0F, 1, 3, 2);
        spike2.setRotationPoint(0F, 0F, 0F);
        setRotation(spike2, 0F, 0F, -0.3665191F);

        CoolerHeadSpikes.addChild(spike1);
        CoolerHeadSpikes.addChild(spike2);

        NamekianAntennas = new ModelRenderer(par1ModelBase, 0, 0);
        NamekianAntennas.addBox(0F, 0F, 0F, 0, 0, 0);
        NamekianAntennas.setRotationPoint(0F, 0F, 0F);

        antenna1 = new ModelRenderer(par1ModelBase, 56, 0);
        antenna1.addBox(-3F, -10F, -4F, 1, 3, 1);
        antenna1.setRotationPoint(0F, 0F, 0F);
        setRotation(antenna1, -0.3490659F, 0F, 0F);

        antenna2 = new ModelRenderer(par1ModelBase, 56, 0);
        antenna2.addBox(2F, -10F, -4F, 1, 3, 1);
        antenna2.setRotationPoint(0F, 0F, 0F);
        setRotation(antenna2, -0.3490659F, 0F, 0F);

        NamekianAntennas.addChild(antenna1);
        NamekianAntennas.addChild(antenna2);

        this.addChild(NamekianAntennas);
        this.addChild(FirstFormSpikes);
        this.addChild(SecondFormSpikes);
        this.addChild(ThirdFormBigHead);
        this.addChild(CoolerHeadSpikes);
    }

    @Override
    public void initData(ModelData data, DBCDisplay display) {
        ModelPartData config = null;

        // --- INÍCIO DA CORREÇÃO ---
        if (data != null) {
            // Lógica para NPCs (com ModelData)
            config = data.getPartData("dbcHorns");
        } else {
            // Lógica para Jogadores (sem ModelData)
            // Criamos um config temporário para que o chifre possa ser controlado pela transformação abaixo
            config = new ModelPartData("dbcHorns");
        }
        // --- FIM DA CORREÇÃO ---

        if (config == null) {
            isHidden = true;
            return;
        }

        if (display == null) {
            isHidden = true;
            return;
        }

        // Configuração de cores baseada na raça
        useColor = 0;
        if (display.race == DBCRace.NAMEKIAN) {
            useColor = 2; // C2 (Verde/Cor da pele Namekuseijin)
            bodyC2 = display.bodyC2;
        }
        if (display.race == DBCRace.ARCOSIAN) {
            useColor = 3; // C3 (Cor do corpo Arcosian)
            bodyC3 = display.bodyC3;
        }

        // Lógica para mudar o chifre baseado na transformação (Form)
        Form form = display.getForm();
        if (form != null) {
            if (display.race == DBCRace.ARCOSIAN) {
                if (form.display.bodyType != null) {
                    switch (form.display.bodyType) {
                        case "firstform":
                            config.type = 2;
                            break;
                        case "secondform":
                            config.type = 3;
                            break;
                        case "thirdform":
                            config.type = 4;
                            break;
                        case "finalform":
                        case "golden":
                            config.type = 0; // Final form remove chifres
                            break;
                        case "ultimatecooler":
                            config.type = 5;
                            break;
                    }
                }
            }
        }

        // Define visibilidade baseado no 'type'
        NamekianAntennas.isHidden = config.type != 1;
        FirstFormSpikes.isHidden = config.type != 2 && config.type != 3 && config.type != 4;
        SecondFormSpikes.isHidden = config.type != 3 && config.type != 4;
        ThirdFormBigHead.isHidden = config.type != 4;
        CoolerHeadSpikes.isHidden = config.type != 5;

        // Define textura se não for a do jogador
        if (!config.playerTexture) {
            location = config.getResource();
        } else {
            location = null;
        }
    }
}
